package top.hyzhu.springboot.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-12 18:22
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Section {
   private String sectionId;
   private String sectionTitle;
   private String specialId;
}
