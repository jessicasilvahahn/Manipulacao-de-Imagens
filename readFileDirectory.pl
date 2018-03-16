#!/usr/bin/perl
$dirname = "/home/jessica/Documentos/Documentos/Racks";
opendir ( DIR, $dirname ) || die "Error in opening dir $dirname\n";
while( (@files = grep { /\.png$/ } readdir(DIR))) {
  foreach $img (@files) {
    $callPython = "python sizeImage.py ".$img;
      system($callPython);
    }
}
closedir(DIR);
