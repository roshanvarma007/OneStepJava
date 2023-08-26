package project;

public class directDownlod {

	public static void main(String[] args) {
		
		String sharableLink = "https://www.dropbox.com/scl/fi/vs8y8381wnxr2wmfna6ja/dFast-web-2-2-3.apk?rlkey=csvifv00xcc50axhn65yj3w5o&dl=0";

		String genrateConnection = "https://www.dl.dropboxusercontent.com";
		
		String downlodelink = genrateConnection + sharableLink.substring(23);
System.out.println(downlodelink);

				
	}

}
