package cn.gcu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_apply")
public class ApplyEntity extends IdEntity {

	private static final long serialVersionUID = 6590214666786068128L;
	@ManyToOne
	@JoinColumn(name = "f_job")
	private JobsEntity job;
	@OneToOne
	@JoinColumn(name = "f_user")
	private UserEntity user;
	@OneToOne
	@JoinColumn(name="f_resume")
	private ResumeEntity resume;
	@Column(name = "f_apply_time")
	private Date applyTime;
	@Column(name = "f_is_offer")
	private boolean isOffer;

	public JobsEntity getJob() {
		return job;
	}

	public void setJob(JobsEntity job) {
		this.job = job;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public boolean isOffer() {
		return isOffer;
	}

	public void setOffer(boolean isOffer) {
		this.isOffer = isOffer;
	}
	
	public ResumeEntity resume() {
		return resume;
	}
	
	public void setResume(ResumeEntity resume) {
		this.resume = resume;
	}

}
