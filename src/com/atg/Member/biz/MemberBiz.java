package com.atg.Member.biz;

import java.util.List;

import com.atg.Member.dto.MemberDto;

public interface MemberBiz {
	
	public List<MemberDto> selectList();
	public MemberDto selectOne(int mb_no);
	public int update(MemberDto dto);
	public List<MemberDto> search(String search_op, String search);

}
