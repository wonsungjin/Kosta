package com.kosta.sample.craw;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class NewsVO {
	private int seq;
	private String href;
	private String img;
	private String title;
	private String ref;
	private String regdate;
}
