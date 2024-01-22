public class Task3 {
    public static void main(String[] args) {

     Item Guitar = new Item("Гибсон", "020512117", "Желтый", "Клен", "США", "115000RUB", 9);
        System.out.println("Товар1");
        System.out.println("Артикул: " + Guitar.vendorCode);
        System.out.println("Данные по товару:" + Guitar.name + "-" + Guitar.price + "-" + Guitar.remainder + "-" + Guitar.color + "-" + Guitar.material + "-" + Guitar.countryOfOrigin);

     Item BluetoothAdapter = new Item("Xiaomi", "177852449","Черный", "Пластик", "Китай", "3700RUB", 60);
        System.out.println("Товар2");
        System.out.println("Артикул: " + BluetoothAdapter.vendorCode);
        System.out.println("Данные по товару:" + BluetoothAdapter.name + "-" + BluetoothAdapter.price + "-" + BluetoothAdapter.remainder + "-" + BluetoothAdapter.color + "-" + BluetoothAdapter.material + "-" + BluetoothAdapter.countryOfOrigin);

     Item capo = new Item("Alice", "988952330", "Красный", "Металл", "Китай", 249);
        System.out.println("Товар3");
        System.out.println("Артикул: " + capo.vendorCode);
        System.out.println("Данные по товару:" + capo.name + "-" + capo.remainder + "-" + capo.color + "-" + capo.material + "-" + capo.countryOfOrigin);

        Item Knife = new Item("Мачете", "554769357", "Коричневый", "Сталь/дерево", "Россия", "12800RUB",3);
        System.out.println("Товар4");
        System.out.println("Артикул: " + Knife.vendorCode);
        System.out.println("Данные по товару:" + Knife.name + "-" + Knife.price + "-" + Knife.remainder + "-" + Knife.color + "-" + Knife.material + "-" + Knife.countryOfOrigin);

        Item TV = new Item("Sony", "170235666", "Белый", "Пластик", "Япония", "78000RUB", 2);
        System.out.println("Товар5");
        System.out.println("Артикул: " + TV.vendorCode);
        System.out.println("Данные по товару:" + TV.name + "-" + TV.price + "-" + TV.remainder + "-" + TV.color + "-" + TV.material + "-" + TV.countryOfOrigin);
        }

    }
