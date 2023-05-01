package org.example;


// Дополните объявление класса Contact
public abstract class Contact {
        // Класс должен содержать одно поле - имя пользователя name
         String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
        public abstract void sendMessage();

    public abstract void print();
        }