#necessario a instalacao dessa biblioteca via pip
from PIL import Image
import sys

img = sys.argv[1]
# Queremos gerar uma imagem com as seguintes dimensoes
x = 70
y = 460
img2 = '/home/jessica/Documentos/Documentos/Racks/'+img
readImg = Image.open(img2)
readImg = readImg.resize((x, y), Image.ANTIALIAS)
readImg.save('/home/jessica/Documentos/novas_imagens/'+img)
