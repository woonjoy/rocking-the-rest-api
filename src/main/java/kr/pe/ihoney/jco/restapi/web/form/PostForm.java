package kr.pe.ihoney.jco.restapi.web.form;

import javax.validation.constraints.NotNull;

import kr.pe.ihoney.jco.restapi.domain.Member;
import kr.pe.ihoney.jco.restapi.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostForm {
    @NotNull
    private String title;
    @NotNull
    private String article;
    @NotNull
    private Member createdBy;
    
    public Post createPost() {
        return new Post(title, article, createdBy);
    }
    
    public Post bind(Post target) {
        target.setTitle(this.title);
        target.setArticle(this.article);
        return target;
    }
}
