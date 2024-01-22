package com.square.rentalDestiny.dto;

import com.square.rentalDestiny.entity.BoardEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BoardDTO {
    private Long boardId;
    private boolean boardCategory;
    private String boardWriter;
    private Date boardDate;
    private String boardTitle;
    private String boardContent;
    private Long boardViewCnt;
    private Long boardLike;
    private Long boardDislike;
    private Long boardCommentCnt;

    public static BoardDTO toBoardDTO(BoardEntity boardEntity){
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setBoardId(boardEntity.getBoardId());
        boardDTO.setBoardCategory(boardEntity.isBoardCategory());
        boardDTO.setBoardWriter(boardEntity.getBoardWriter());
        boardDTO.setBoardDate(boardEntity.getBoardDate());
        boardDTO.setBoardTitle(boardEntity.getBoardTitle());
        boardDTO.setBoardContent(boardEntity.getBoardContent());
        boardDTO.setBoardViewCnt(boardEntity.getBoardViewCnt());
        boardDTO.setBoardLike(boardEntity.getBoardLike());
        boardDTO.setBoardDislike(boardEntity.getBoardDislike());
        boardDTO.setBoardCommentCnt(boardEntity.getBoardCommentCnt());

        return boardDTO;
    }


}