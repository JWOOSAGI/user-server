package com.von.userbackend.article.service;


import com.von.userbackend.article.model.ArticleDTO;
import com.von.userbackend.article.repository.ArticleRepository;
import com.von.userbackend.common.component.MessengerVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository repo;

    @Override
    public MessengerVO save(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public MessengerVO deleteById(Long id) {
        repo.deleteById(id);
        return new MessengerVO();
    }

    @Override
    public MessengerVO modify(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public List<ArticleDTO> findAll() {
        return repo.findAll().stream().map(i -> entityToDTO(i)).toList();
    }

    @Override
    public Optional<ArticleDTO> findById(Long id) {
        return repo.findById(id).map(this::entityToDTO);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

//    @Override
//    public List<ArticleDTO> myList(Long id) {
//        return repo.findAll().stream().filter(i->i.getBoard().getId().equals(id)).map(i->entityToDTO(i)).toList();
//
//    }

    @Override
    public List<ArticleDTO> myList(Long id) {
        return repo.findAllByBoardId(id)
                .stream().map(i -> entityToDTO(i))
                .toList();
    }


}

