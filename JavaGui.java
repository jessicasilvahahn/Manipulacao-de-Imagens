import javax.swing.*;
import java.io.File;
import java.io.*;

public class JavaGui {

	public static String showChossedWindow(String m){
		String s = m;
		String dirNow="";
		JFileChooser dirChooser = new JFileChooser();
        dirChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		JOptionPane.showMessageDialog(null, s);
        	int retorno = dirChooser.showOpenDialog(null);
			if (retorno == JFileChooser.APPROVE_OPTION) {
			File dir =dirChooser.getSelectedFile();
			dirNow = dir.getPath();
			return dirNow;
			}else{

	  		}
	  		return "Erro";
	}
    public static void main(String[] args) {
        String m = "Escolha o diretório onde estão as imagens";
        String dir1 = JavaGui.showChossedWindow(m);
        m = "Escolha o diretório onde se deseja guardar as imagens";
        String dir2 = JavaGui.showChossedWindow(m);
		try{	
        	Process p = Runtime.getRuntime().exec("/usr/bin/perl readFileDirectory.pl "+dir1+" "+dir2);
		    BufferedReader in = new BufferedReader(
                                new InputStreamReader(p.getInputStream()));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

    	}
    	catch(Exception ioe){
        	ioe.printStackTrace();
    	}
	}
}

