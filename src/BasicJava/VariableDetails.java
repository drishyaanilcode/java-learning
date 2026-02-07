package BasicJava;

public class VariableDetails {
        public static void main(String[] args) {
            int age = 25;           // 'age' is a variable that stores the number 25
            String name = "Drishya"; // 'name' is a variable that stores text

            System.out.println("Name: " + name);
            name = "Diya";
            System.out.println("Name"+name);
            System.out.println("Age: " + age);
        }
    }

/* Variable is a container which store data.
Variable will be Immutable by final.
final String country = "UAE";
If you try to change complilation error will come.

Primitive Data type : store one value only.

| Type      | Use                     | Example |
| --------- | ----------------------- | ------- |
| `int`     | Whole numbers           | 10      |
| `double`  | Decimal numbers         | 10.5    |
| `char`    | Single letter/character | 'A'     |
| `boolean` | True or False           | true    |

Non-Primitive Types (store objects/collections)
| Type     | Use                           | Example                   |
| -------- | ----------------------------- | ------------------------- |
| `String` | Words / sentences             | "Drishya"                 |
| Array    | Group of same type values     | int[] marks = {90,80}     |
| Object   | Custom things (class objects) | Student s = new Student() |

Primitive → simple → stores value directly
Non-Primitive → complex → stores reference

Multiple Variables in One Line
int a = 10, b = 20, c = 30;

Type Casting
Converting one data type into another.

Widening Casting (Automatic)
int myInt = 10;
double myDouble = myInt;  // int automatically converted to double
System.out.println(myDouble); // 10.0
 */

