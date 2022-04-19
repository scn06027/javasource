package board.util;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadUtil {
	public HashMap<String, String> uploadFile(HttpServletRequest request){
		HashMap<String,String> dataMap=new HashMap<String,String>();
		
		//commons로 가져올것
		// request에 upload 요청이 있는지 확인해줌ㄴ
		boolean isMulti=ServletFileUpload.isMultipartContent(request);
		if(isMulti){ //null값이 아니라면?
			//전송된 파일을 디스크에 저장하기위한 객체
			DiskFileItemFactory factory = new DiskFileItemFactory();

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);

			// Parse the request
			List<FileItem> items=null;
			try {
				items = upload.parseRequest(request);
			} catch (FileUploadException e1) {
				e1.printStackTrace();
			}
		
			//form인지 file 데이터인지 구분하는 작업
			String fieldName="",fileName="",value="";
			Iterator<FileItem> iter = items.iterator();
			while (iter.hasNext()) {
	    		FileItem item = iter.next();
		
	    		if (item.isFormField()) { //type=text,password,email...
	      		  fieldName=item.getFieldName();
	    		try {
					value=item.getString("utf-8");//사용자의 입력값이들어온다
					dataMap.put(fieldName, value); //필드명,밸류
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
	   		 } else {
	   			 fieldName=item.getFieldName();
	   			 fileName=item.getName();
	   			 //파일저장(서버에다 저장하는거임)
	        	//동일한 파일 명이 들어올 경우=> 중복되지 않은 고유의 값을 파일명에 추가
	   			 if(!fileName.isEmpty()&&item.getSize()>0){
	        		String path="C:\\개발자과정\\upload";
	        		UUID uuid=UUID.randomUUID();
	        		File uploadFile=new File(path+"\\"+uuid.toString()+"_"+fileName);
	        		dataMap.put(fieldName,uploadFile.getName());
	        		try {
						item.write(uploadFile);
					} catch (Exception e) {
						e.printStackTrace();
					}
	        	}
	   		 
	   		 }
	    }
	}
		
		return dataMap;
	}
}
