package com.von.userbackend.common.component.pagination;

import com.von.userbackend.article.model.ArticleDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Getter
@Builder
@AllArgsConstructor
public class PageRequestFileVO {
    private int page;
    private int size;
    private String type;
    private String keyword;

    private List<ArticleDTO> pageFileDTO;

    public PageRequestFileVO() {
        this.page = 1;
        this.size = 10;
    }

    public Pageable getPageable(Sort sort){
        return PageRequest.of(page - 1, size, sort);
    }
}
