package PartyShopManagerThuQuynh;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FileTypeFiler extends FileFilter {
	   public final String extension; 
	      public final String description;

	      public FileTypeFiler (String extension, String description) {

	             this.description = description; 
	             this.extension = extension;

	      }
	@Override
	public boolean accept(File f) {
		 if(f.isDirectory()) {
   		  return true;
   	  }
   	  return f.getName().endsWith(extension);

	}

	@Override
	public String getDescription() {
		  return description + String.format("(*%s)", extension);
	}

}
