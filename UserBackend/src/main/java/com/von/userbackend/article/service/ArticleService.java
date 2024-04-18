package com.von.userbackend.article.service;

import com.von.userbackend.article.model.Article;
import com.von.userbackend.article.model.ArticleDTO;
import com.von.userbackend.common.service.CommandService;
import com.von.userbackend.common.service.QueryService;

import java.util.List;

public interface ArticleService extends CommandService<ArticleDTO>, QueryService<ArticleDTO> {

    //추상 메소드 : 오버라이딩되어 로직이 여러 모양으로 바뀔 수 있음.
//    Map<String, ?> test();

    //디폴트 메소드 : 안의 로직이 계속 반복된다면 구현을 한번만 해서 사용.
//    default Map<String,?> dtoToEntity(ArticleDTO dto){
//        Map<String,Article> map = new HashMap<>();
//        Article article = Article.builder().build();
//        map.put("article",article);
//
//        //boardId로 db를 조회해서 해당 게시판에 게시된 글의 목록을 가져올 경우
//        List<ArticleDTO> articleDTOList = new ArrayList<>();
//
//
//
//        return map;
//    }
//
//    default Optional<ArticleDTO> entityToDTO(Article ent){
//        ArticleDTO dto = ArticleDTO.builder()
//                .content(ent.getContent())
//                .build();
//        return Optional.ofNullable(dto);
//    }

    default Article dtoToEntity(ArticleDTO dto){
        return Article.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .content(dto.getContent())
                .build();
    }
    default  ArticleDTO entityToDTO(Article article){
        return ArticleDTO.builder()
                .id(article.getId())
                .title(article.getTitle())
                .content(article.getContent())
                .build();
    }

    List<ArticleDTO> myList(Long id);
}
