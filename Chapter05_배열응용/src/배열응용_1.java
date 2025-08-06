import java.io.*; // 파일 입출력
import java.util.*; // 검색 => 검색어
public class 배열응용_1 {
//1929|최악의 하루|멜로/로맨스|https://movie-phinf.pstatic.net/20160712_61/1468283187882s0unW_JPEG/movie_image.jpg?type=m77_110_2|한예리(은희), 이와세 료(료헤이), 권율(현오)|2016 .08.25 개봉|15세 관람가|김종관
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String movie="";
		File file=new File("c:\\javaDev\\movie.txt");
		StringBuffer sb=new StringBuffer();
		int i=0; // 파일 읽어서 저장하는 변수
		// 한글자 읽기 => 정수로 읽는다 'A' => 65
		FileReader fr=new FileReader(file);
		while((i=fr.read())!=-1) {
			// -1 : EOF // 파일의 끝
			sb.append((char)i);
		}
		
		fr.close();
		movie=sb.toString(); 
		//System.out.println(movie);
		
		String[] mnos=new String[1938];
		String[] titles=new String[1938];
		String[] genres=new String[1938];
		String[] posters=new String[1938];
		String[] actors=new String[1938];
		String[] regdates=new String[1938];
		String[] grades=new String[1938];
		String[] directors=new String[1938];
		
		/*
		 * 	class Movie
		 * 	{
		 * 		String mno,title,genre,poster,actor,regdate,grade,directors;
		 * 	}
		 * 
		 * 	Movie m=new Movie();
		 */
		i=0;
		String[] movies=movie.split("\n");
		for(String m:movies) {
			//System.out.println(m);
			String[] info=m.split("\\|");
			// 정규식 => | \> |출력 ==> \\|
			mnos[i]=info[0];
			titles[i]=info[1];
			genres[i]=info[2];
			actors[i]=info[4];
			grades[i]=info[6];
			i++;
		}
		
//		// 1. 영화명
//		for(String s:genres) {
//			System.out.println(s);
//		}
		// 1. 출연진을 입력 받아서 => 출연한 영화
		Scanner scan=new Scanner(System.in);
		System.out.print("출연진 이름을 입력하세요>");
		String name=scan.next();
		
		System.out.println("====="+name+"님의 출연작=====");
		int count=0;
		for(i=0;i<actors.length;i++) {
			if (actors[i].contains(name)) {
				System.out.println(titles[i]);
				count++;
			}
		}
		System.out.println("총 출연 작품은 "+count+"편입니다");
		// 총 몇편 출연
		
		// => 12세 관람 영화
		for(i=0;i<grades.length;i++) {
			if(grades[i].contains("12")) {
				System.out.println(titles[i]);
			}
		}
	}

}
