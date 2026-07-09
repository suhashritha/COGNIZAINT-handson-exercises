interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Document");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document");
    }
}

class DocumentFactory {

    public static Document createDocument(String type) {

        switch (type.toLowerCase()) {
            case "word":
                return new WordDocument();

            case "pdf":
                return new PdfDocument();

            case "excel":
                return new ExcelDocument();

            default:
                throw new IllegalArgumentException("Invalid document type");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Document word = DocumentFactory.createDocument("word");
        word.open();

        Document pdf = DocumentFactory.createDocument("pdf");
        pdf.open();

        Document excel = DocumentFactory.createDocument("excel");
        excel.open();
    }
}
