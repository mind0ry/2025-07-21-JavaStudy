import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Member {
	private String id;
	private String pwd;
	private String name;
	private String sex;
	private int age;
	
}
