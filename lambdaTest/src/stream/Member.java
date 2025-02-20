package stream;

import java.util.Objects;

public class Member {
	private String name;
	private String hobby;
	private String info;
	
	public Member() {;}

	public Member(String name, String hobby, String info) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.info = info;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", hobby=" + hobby + ", info=" + info + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hobby, info, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(hobby, other.hobby) && Objects.equals(info, other.info)
				&& Objects.equals(name, other.name);
	}
	
	
}
