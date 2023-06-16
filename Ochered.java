package ochered;
class Och {
    /*Вводим класс.*/
    private int mass[];
    /*Инициализируем массив.*/
    private int max;
    /*Инициализируем максимальную длину массива.*/
    private int ell;
    /*Инициализируем текущее число элементов.*/
    private int f;
    private int r;
    public Och(int max) {
        this.max = max;
        mass = new int[max];
        f=0;
        ell=0;
        /*Начальный элемент очереди.*/
        r=-1;
        /*Проверка не выходит ли программа за границы массива.*/
    }
    public void vstav(int element) {
        /*Метод ввода значений элементов в очереди.*/
        if(r == max-1) {
            r = -1;
        }
        mass[++r]=element;
        /*Добавялем последний элемент очереди.*/
        ell++;
        /*Перпеходим на следующую позицию в очереди.*/
    }
    public int delete() {
        /*Метод удаления элементов массива.*/
        int p = mass[f++];
        /*Получаем первый элемент из очереди.*/
        if (f == max) { 
          f = 0;
        }
        ell--;
        /*Уменьщаем число элементов в очереди.*/
        return p;
        /*Возвращаем первый элемент из очереди.*/
    }
    public int F() {
        return mass[f];
        /*Метод возвращает массив значений.*/
    }
    public int get() {
        return ell;
        /*Метод возвращает число текущих элементов.*/
    }
    public boolean elm() {
        return(ell == 0);
        /*Метод проверяет пуст ли массив.*/
    }
    public boolean polney() {
        return(ell == max-1);
        /*Метод проверяет, что текущий элемент является последним элементов массива.*/
    }
}
public class Ochered {

public static void main(String[] args) {
    /*Основное тело программы.*/
        Och ocher = new Och(10);
        /*Выделяем память под класс.*/
        ocher.vstav(45);
        /*Инициализируем элемент массива и вставляем его в массив, очередь.*/
        ocher.vstav(4);
        ocher.vstav(-23);
        ocher.vstav(-89);
        ocher.vstav(98);
        ocher.vstav(99);
        ocher.vstav(90);
        ocher.vstav(456);
        ocher.vstav(9456);
        ocher.delete();
        /*Удаляем элемент из очереди.*/
        ocher.delete();
        ocher.delete();
        ocher.delete();
        ocher.delete();
        ocher.delete();
        ocher.vstav(900);
        /*Инициализируем элемент массива и вставляем его в массив, очередь.*/
        System.out.println("Vivod number: ");
        while(!ocher.elm()){
            /*Выводим массив на экран.*/
            /*Для этого будем использовать цикл, пока не закончится массив.*/
            int i=ocher.delete();
            System.out.println(+i);
            /*Проходим по массиву.*/
        }
    }
    
}
