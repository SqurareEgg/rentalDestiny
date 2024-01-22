package com.square.rentalDestiny.entity;

import com.square.rentalDestiny.dto.BoardDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "board_table")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column
    private boolean boardCategory;

    @Column
    private String boardWriter;

    @Column
    @CreationTimestamp
    private Date boardDate;

    @Column
    private String boardTitle;

    @Column
    private String boardContent;

    @Column
    private Long boardViewCnt;

    @Column
    private Long boardLike;

    @Column
    private Long boardDislike;

    @Column
    private Long boardCommentCnt;

    public static BoardEntity toBoardEntity(BoardDTO boardDTO){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setBoardId(boardDTO.getBoardId());
        boardEntity.setBoardCategory(boardDTO.isBoardCategory());
        boardEntity.setBoardWriter(boardDTO.getBoardWriter());
        boardEntity.setBoardDate(boardDTO.getBoardDate());
        boardEntity.setBoardTitle(boardDTO.getBoardTitle());
        boardEntity.setBoardContent(boardDTO.getBoardContent());
        boardEntity.setBoardViewCnt(boardDTO.getBoardViewCnt());
        boardEntity.setBoardLike(boardDTO.getBoardLike());
        boardEntity.setBoardDislike(boardDTO.getBoardDislike());
        boardEntity.setBoardCommentCnt(boardDTO.getBoardCommentCnt());

        return boardEntity;
    }

}