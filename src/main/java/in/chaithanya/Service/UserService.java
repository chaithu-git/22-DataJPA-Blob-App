package in.chaithanya.Service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.chaithanya.entity.User;
import in.chaithanya.repository.UserRepository;

@Service
public class UserService  {
	
	@Autowired
	 private UserRepository userRep;
	 
	 public void  saveUser() throws Exception {
		 
		 String imagePath="C:\\Users\\ADMIN\\OneDrive\\Documents\\Downloads\\durgadevi.jpg";	 
		 User u=new User();
		 //u.setUserId(100);
		 u.setUserName("dhakshith");
		 u.setUserEmail("chaitu@gmail.com");
		 long size=Files.size(Paths.get(imagePath));
		 
		 byte[] arr=new byte[(int) size];
		 FileInputStream fis=new FileInputStream(new File(imagePath));
		 fis.read(arr);
		 fis.close();
		 
		 u.setUserImage(arr);
		 userRep.save(u);
		 
		 
		 
		 
	 }
	 
	
		

}
