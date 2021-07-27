
package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.orm.Admin;
import com.orm.Board;
import com.service.IBoardService;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

public class BoardAction extends ActionSupport{
    @Resource(name="boardService")
    IBoardService boardService;
    
    private List<Board> boardList;
    //子节点
    private List<Board> childBoards;
 //根节点
    private List<Board> rootBoards;

    private Board board;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
    public List<Board> getChildBoards() {
        return childBoards;
    }

    public void setChildBoards(List<Board> childBoards) {
        this.childBoards = childBoards;
    }
    
     public List<Board> getBoardList() {
        return boardList;
    }

    public void setBoardList(List<Board> boardList) {
        this.boardList = boardList;
    }
    public List<Board> getRootBoards() {
        return rootBoards;
    }

    public void setRootBoards(List<Board> rootBoards) {
        this.rootBoards = rootBoards;
    }

  
    //加载主版块
    @Override
    public String execute() throws Exception {
        try {
           loadRootBoards();
           return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }
       
    }
    //加载所有版块
    public String listBoard() throws Exception
    {
        try {
               setBoardList(boardService.loadAllBoards());
               return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }
    //加载二级版块
    public String listChildBoards() throws Exception
    {
        
        int parentId = Integer.valueOf(ServletActionContext.getRequest().getParameter("parentId"));
        try {
         loadRootBoards();
         setChildBoards(boardService.loadChildBoards(parentId));
         return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }
    //加载根版块
    public String loadRootBoards() throws Exception
    {
        try {
            setRootBoards(boardService.loadRootBoards());
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }
    //跳转添加版块
    public String prepareAddBoard() throws Exception
    {
        try {
             setBoardList(boardService.loadAllBoards());
             return "addBoard";
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }
    //添加版块
    public String addBoard() throws Exception
    {
        Admin admin = (Admin)ServletActionContext.getRequest().getSession().getAttribute("admin");
        //这里本想获取parentId,但是鉴于多对一映射为board，不知如何获取，所有换为获取版块id
        //获取版块id，
        //判断添加1级版块或者下级版块，首先先取出parentId
        int bid = getBoard().getId();
        int parentId = 0;
        Board tempBoard =new Board() ;
        //赋值的时候一定要判断是否为空
        //有些空指针异常是session失效导致的
        try 
        {      //处理添加一级版块
           if (bid==-1) 
           {
               tempBoard.setName(getBoard().getName());
               tempBoard.setAdmin(admin);
               tempBoard.setDescription(getBoard().getDescription());
               //提交
               if (boardService.saveOrUpdateBoard(tempBoard)) {
                  return "addSuccess";
               }
              return ERROR;
   
            }
              //处理添加二级版块
           else 
            {
              //逻辑错误 parentId = boardService.loadBoard(bid).getBoard().getId();
                //根据id加载被添加子版块的父版块
               Board board = boardService.loadBoard(bid);
               tempBoard.setName(getBoard().getName());
               tempBoard.setAdmin(admin);
               tempBoard.setBoard(board);
               tempBoard.setDescription(getBoard().getDescription());
               //提交
                if ( boardService.saveOrUpdateBoard(tempBoard)) {
                      return "addSuccess";
                }
                  return ERROR;
            }
          
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return ERROR;
        }
  
        
        
       
    }
    
    public String prepareModifyBoard() throws Exception
    {
         //获取版块id
        HttpServletRequest request = ServletActionContext.getRequest(); 
        int bid = 0;
        if (request.getParameter("bid")!=null) {
            bid = Integer.valueOf(request.getParameter("bid").toString());
        }
        setBoard(boardService.loadBoard(bid));
        loadRootBoards();
        return "prepareModifyBoard"; 
    }         
}
