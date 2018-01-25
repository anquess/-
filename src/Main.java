public class Main {
	public static void main(String[] args)throws Exception{
		for (int i = 0; i < 3; i++) {
			singLine1(i);
			singLine2(i);
			singLine3(i);
			singLine4(i);
			singLine5(i);
			singLine6(i);
		}
	}

	public static void singLine1(int i) {
		String lyrics = "エラー";
		switch(i){
		case 0:
			lyrics = "青き海原　はるかに望み";
			break;
		case 1:
			lyrics = "緑の大地に　そよ風かおり";
			break;
		case 2:
			lyrics = "真白き雲間に　新たな道を";
			break;
		}
		System.out.println(lyrics);
	}

	public static void singLine2(int i) {
		String lyrics = "エラー";
		switch(i){
		case 0:
			lyrics = "きらめく翼よ";
			break;
		case 1:
			lyrics = "豊けき学び舎";
			break;
		case 2:
			lyrics = "広がる世界よ";
			break;
		}
		lyrics = lyrics + singAddSame(2);
		System.out.println(lyrics);
	}

	public static void singLine3(int i) {
		String lyrics = "エラー";
		switch(i){
		case 0:
			lyrics = "雲つらぬく轟き　見守る";
			break;
		case 1:
			lyrics = "声かけあい励まし　青春";
			break;
		case 2:
			lyrics = "音速超えゆく時代の　若人";
			break;
		}
		lyrics = lyrics + singAddSame(3);
		System.out.println(lyrics);
	}

	public static void singLine4(int i) {
		String lyrics = "エラー";
		switch(i){
		case 0:
			lyrics = "夢はてしなき";
			break;
		case 1:
			lyrics = "歌こだまする";
			break;
		case 2:
			lyrics = "星めぐり逢う";
			break;
		}
		lyrics = lyrics + singAddSame(4);
		System.out.println(lyrics);
	}

	public static void singLine5(int i) {
		String lyrics = "エラー";
		switch(i){
		case 0:
			lyrics = "翔ける";
			break;
		case 1:
			lyrics = "学ぶ";
			break;
		case 2:
			lyrics = "生きる";
			break;
		}
		lyrics = lyrics + singAddSame(5);
		System.out.println(lyrics);
	}

	public static void singLine6(int i) {
		System.out.println(singAddSame(6));
	}

	public static String singAddSame(int i) {
		switch (i) {
		case 2:
			return "　今幸あれ";
		case 3:
			return "われら";
		case 4:
			return "　大空に";
		case 5:
			return "歓び　ともに";
		case 6:
			return "航空保安大学校\n";

		}
		return null;
	}


}
