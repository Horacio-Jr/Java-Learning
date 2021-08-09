package Factory.Method.Patern;

import Template.Method.Patern.FileGenerator;

public abstract class AbstractService<E> {
    public FileGenerator fileGenerator;

    public AbstractService(FileGenerator fileGenerator) {
        this.fileGenerator = fileGenerator;
    }

    public abstract DAO<E> getDao();

    public void saveEntityOnAFile(Object id, String fileName) {
        E entity = getDao().findById(id);
        //fileGenerator.fileGenerate(fileName, ((E) entity).getMap());

    }
}
