package in.tech_camp.firstapp.entity;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class PostEntity {
    private Integer id;
    private String content;
    private Timestamp createdAt;
}