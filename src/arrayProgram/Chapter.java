package arrayProgram;

public class Chapter {
	int pageNum;
	String chapterName;
	
	public Chapter(String chapterName, int pageNum) {
		this.pageNum=pageNum;
		this.chapterName=chapterName;
	}
	
	public static String nearestChapter(Chapter[] chapter,int page) {
		int[] diff=new int[chapter.length];
		for(int i=0;i<chapter.length;i++) {
			diff[i]=Math.abs(page-chapter[i].pageNum);
		}
		int min=diff[0];
		int index=0;
		for(int i=1;i<diff.length;i++) {
			if(min>diff[i]) {
				min=diff[i];
				index=i;
			}
		}
		return chapter[index].chapterName;
	}
	public static void main(String[] args) {
		Chapter[] chapter= {new Chapter("Chapter 1", 1), new Chapter("Chapter 2", 15),
				  new Chapter("Chapter 3", 37)};
		Chapter[] chapter1={new Chapter("New Beginnings", 1),
				  new Chapter("Strange Developments", 62),
				  new Chapter("The End?", 194),
				  new Chapter("The True Ending", 460)};
		System.out.println(nearestChapter(chapter, 10));
		System.out.println(nearestChapter(chapter1, 200));
	}

	
	}

