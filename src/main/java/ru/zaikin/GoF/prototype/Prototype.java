package ru.zaikin.GoF.prototype;


// Базовый интерфейс "Прототип"
public interface Prototype extends Cloneable {
    Prototype clone();
}

// Конкретный класс, который поддерживает клонирование
class Document implements Prototype {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public Prototype clone() {
        // Создаём новый объект, копируя данные
        return new Document(this.title, this.content);
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

// Клиентский код
class PrototypeDemo {
    public static void main(String[] args) {
        Document original = new Document("Report", "Annual financial data");
        Document copy = (Document) original.clone();

        System.out.println("Оригинал: " + original);
        System.out.println("Копия:    " + copy);
    }
}
