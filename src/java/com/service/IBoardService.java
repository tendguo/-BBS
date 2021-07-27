package com.service;

import com.orm.Board;
import java.util.List;


public interface IBoardService {
     //加载Board
    public Board loadBoard(int id);
       
    //加载子板块
    public List<Board> loadChildBoards(int parentId);
    
    //加载板块
    public List<Board> loadAllBoards();
    
    //加载根栏目
    public List<Board> loadRootBoards();
    
    //保存更新版块
    public boolean  saveOrUpdateBoard(Board board);
    
}
