package com.cn.app.chatgptbot.flow.chat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Delta {
   private String content;
   private String role;
}
