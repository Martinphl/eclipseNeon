
import java.io.File;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TesseractExample {

	public static void main(String[] args) throws TesseractException {
		File imageFile = new File("timg.jpg");
		ITesseract instance = new Tesseract(); // JNA Interface Mapping

		String result = instance.doOCR(imageFile);
		System.out.println(result);

	}
}