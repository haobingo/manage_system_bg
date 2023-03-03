package com.example.object.examinePaper;

import lombok.Data;

@Data
public class courseFinalExamPaperDetail {
   private Integer id;
   //外键链接courseFinalExamPaper表id
   private int primaryId;
   //题号
   private String titleNumber;
   private int score;
   //对应指标点
   private String indicatorPoints;
   //对应课程目标
   private String courseTarget;


}

