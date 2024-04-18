//package com.von.kubernetesuser.article.service;
//
//import com.von.kubernetesuser.article.model.Article;
//import com.von.kubernetesuser.article.model.ArticleDTO;
//import com.von.kubernetesuser.article.repository.ArticleRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.BDDMockito;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//@ExtendWith(MockitoExtension.class)
//class ArticleServiceImplTest {
//
//    private ArticleService service;
//    private static Article testArticle;
//    @Mock
//    private ArticleRepository repository;
//    @BeforeEach
//    void setup() {
//        this.service = new ArticleServiceImpl(repository);
//    }
//
//    @BeforeEach
//    void init(){
//        testArticle = Article.of(1L,"테스트 제목","테스트 글");
//    }
//
//    @Test
//    public void 게시글_제목_검색()throws Exception{
//        // Given
//        repository.save(testArticle);
//
//        // When
//        Article article = repository.findById(1L).get();
//
//        //Then
//        assertThat(article.getTitle())
//                .isEqualTo("테스트 제목");
//    }
//
//    @Test
//    public void 게시글_전체_검색()throws Exception{
//        List<Article> articles = getList();
//        BDDMockito.given(repository.findAll()).willReturn(articles);
//        List<ArticleDTO> list = service.findAll();
//        assertThat(list.size())
//                .isEqualTo(3);
//    }
//
//    private List<Article> getList() {
//        return Arrays.asList(
//                Article.builder().id(1L).title("유관순").content("3.1운동 주역").build(),
//                Article.builder().id(2L).title("김구").content("임시정부").build(),
//                Article.builder().id(3L).title("윤봉길").content("독립운동").build()
//        );
//    }
//
//}