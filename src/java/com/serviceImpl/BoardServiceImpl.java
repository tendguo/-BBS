package com.serviceImpl;

import com.dao.BaseDao;
import com.orm.Board;
import com.service.IBoardService;
import java.util.List;
import javax.annotation.Resource;


public class BoardServiceImpl implements IBoardService{
    
        
    @Resource(name="dao")
     BaseDao dao;
    
    @Override
    public Board loadBoard(int id) {
        return (Board) dao.loadById(Board.class,new Integer(id));
    }
   
    

    @Override
    public List<Board> loadChildBoards(int parentId) {
         final String queryChilds = "from Board as b where b.board ='"+parentId+"' order by b.id asc ";
        return dao.query(queryChilds);
    }

    @Override
    public List<Board> loadAllBoards() {
       return dao.listAll("Board");
    }

    @Override
    public List<Board> loadRootBoards() {
      return dao.query("from Board as b where b.board is  null order by b.id asc ");
    }

    @Override
    public boolean saveOrUpdateBoard(Board board) {
        try 
        {
             dao.saveOrUpdate(board);
             return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    
}
