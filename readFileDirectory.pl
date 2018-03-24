#!/usr/bin/perl
$diretorioOriginal = $ARGV[0];
$diretorioSave = $ARGV[1];
if($diretorioOriginal or $diretorioSave){
	opendir ( DIR, $diretorioOriginal ) || die "Error in opening dir $diretorioOriginal\n";
	while( (@files = grep { /\.jpg$/ } readdir(DIR))) {
	 foreach $img (@files) {
	   $callPython = "python sizeImage.py ".$img." ".$diretorioOriginal." ".$diretorioSave;
	      system($callPython);
	   }
	}
	closedir(DIR);
}else{
	die "Erro sem passagem de parâmetros";
}

