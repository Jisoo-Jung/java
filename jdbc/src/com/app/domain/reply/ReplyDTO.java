package com.app.domain.reply;

import java.util.Objects;

public class ReplyDTO {
	private Long id;
    private String replyContent;
//  private String postTitle; //지수(postTitle 없어도 된다고 함. 이유는?)
    private Long postId;	//강사
    private Long memberId;	//강사
//  어떤 게시글에 댓글을 작성했는지 알 수 있도록 게시글 번호 필요.
//  이름은 중복이 있을 수 있으므로, 중복 없는 회원 아이디 필요.
    private String memberName;
    private String createdDate;
    private String updatedDate;
    
    public ReplyDTO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

//	public String getPostTitle() {
//		return postTitle;
//	}
//
//	public void setPostTitle(String postTitle) {
//		this.postTitle = postTitle;
//	}
	


	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}


	@Override
	public String toString() {
		return "ReplyDTO [id=" + id + ", replyContent=" + replyContent + ", postId=" + postId + ", memberId=" + memberId
				+ ", memberName=" + memberName + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReplyDTO other = (ReplyDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	public ReplyVO toVO() { //강사...작성한 이유 주석 달기
	      ReplyVO replyVO = new ReplyVO();
	      replyVO.setId(this.getId());
	      replyVO.setMemberId(this.getMemberId());
	      replyVO.setPostId(this.getPostId());
	      replyVO.setReplyContent(this.getReplyContent());
	      replyVO.setCreatedDate(this.getCreatedDate());
	      replyVO.setUpdatedDate(this.getUpdatedDate());
	      return replyVO;
	   }

   
}
