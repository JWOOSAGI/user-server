package com.von.userbackend.board.serivce;

import com.von.userbackend.board.model.Board;
import com.von.userbackend.board.model.BoardDTO;
import com.von.userbackend.common.service.CommandService;
import com.von.userbackend.common.service.QueryService;

public interface BoardService extends  CommandService<BoardDTO>, QueryService<BoardDTO> {

    default Board dtoToEntity(BoardDTO dto){
        return Board.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .build();
    }
    default  BoardDTO entityToDto(Board board){
        return BoardDTO.builder()
                .id(board.getId())
                .title(board.getTitle())
                .description(board.getDescription())
                .build();
    }
}
