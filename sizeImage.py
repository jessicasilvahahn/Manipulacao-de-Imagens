#necessario a instalacao dessa biblioteca via pip
from PIL import Image
import sys
img = sys.argv[1]
directoryOriginal = sys.argv[2]
directorySave = sys.argv[3]
# Queremos gerar uma imagem com as seguintes dimensoes
x = 300
y = 460
saveDir = directorySave+'/'+img
imgOriginal = directoryOriginal+'/'+img
readImg = Image.open(imgOriginal)
readImg = readImg.resize((x, y), Image.ANTIALIAS)
readImg.save(saveDir)
