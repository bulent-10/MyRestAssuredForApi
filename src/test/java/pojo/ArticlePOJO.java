package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@ToString
public class ArticlePOJO {

    private String author;
    private String title;
    private String description;

}
