package _1_decorator._99_exercice.avecpattern;

import _1_decorator._99_exercice.Compressor;
import _1_decorator._99_exercice.DataSource;

public class CompressorDecorator extends DataSourceDecorator {

    private Compressor m_compressor;

    CompressorDecorator(DataSource dataSource) {
        super(dataSource);
        m_compressor = new Compressor();
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(m_compressor.compress(data));
    }

    @Override
    public String readData() {
        return m_compressor.decompress(dataSource.readData());
    }

}
