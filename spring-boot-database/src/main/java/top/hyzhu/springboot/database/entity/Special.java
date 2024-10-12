package top.hyzhu.springboot.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-12 18:22
 **/

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Special {
    private String id;
    private String title;
    private String introduction;
    private String banner;
    private Integer viewCount;
    private Integer followersCount;
    private Boolean isFollowing;
    private Long updated;
    private List<Section> sections;
}
