package _1_decorator._99_exercice.avecpattern;

import _1_decorator._99_exercice.Compressor;
import _1_decorator._99_exercice.DataSource;

public class CompressorDecorator extends DataSourceDecorator {

    private Compressor compressor;

    CompressorDecorator(DataSource dataSource) {
        super(dataSource);
        compressor = new Compressor();
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(compressor.compress(data));
    }

    @Override
    public String readData() {
        return compressor.decompress(dataSource.readData());
    }

}
