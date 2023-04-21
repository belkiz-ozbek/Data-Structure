
// Name      : Belkız
// Surname   : Özbek
// Student ID: 20050111050
class Node {

    private int data;

    public int getData() {
        return data;
    }

    public Node next;

    public Node(int dd) {
        data = dd;
    }

    // You can add more functions but you can't change the given code.
}

////////////////////////////////////////////////////////////////
class MyStack {

    private Node first;

    public MyStack() {
        first = null;
    }

    public void push(int dd) {
        Node node = new Node(dd);
        if (first == null) {
            first = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public int peek() {

        if (first == null) {
            throw new RuntimeException();
        } else {
            return first.getData();
        }

    }

    public int pop() {
        if (first == null) {
            throw new RuntimeException();
        } else {
            int temp = first.getData();
            first = first.next;
            return temp;
        }
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }

    public String evaluate(String command) {
        StringBuilder sb = new StringBuilder("");

        String[] commands = command.split(" ");

        for (String str : commands) {
            switch (str) {
                case "pop":
                    try {
                    int data = pop();
                    sb.append(data).append("\n");
                } catch (RuntimeException e) {
                    sb.append("Not enough integers in the stack\n");
                }
                break;
                case "print":
                    sb.append("[");
                    Node temp = first;
                    while (temp != null) {
                        sb.append(temp.getData());
                        temp = temp.next;
                        if (temp != null) {
                            sb.append(", ");
                        }
                    }
                    sb.append("]\n");

                    break;
                case "exit":
                    sb.append("$\n");
                    break;
                case "peek":
                    sb.append(peek()).append("\n");
                    break;
                case "+":

                    if (first.next != null) {
                        int num1 = pop();
                        int num2 = pop();
                        push(num1 + num2);
                    } else {
                        sb.append("Not enough integers in the stack\n");
                    }
                    break;
                case "-":

                    if (first.next != null) {
                        int num1 = pop();
                        int num2 = pop();

                        push(num2 - num1);
                    } else {
                        sb.append("Not enough integers in the stack\n");
                    }

                    break;
                case "*":
                    if (first.next != null) {
                        int num1 = pop();
                        int num2 = pop();
                        push(num1 * num2);
                    } else {
                        sb.append("Not enough integers in the stack\n");
                    }
                    break;
                case "/":
                    if (first.next != null) {
                        int num1 = pop();
                        int num2 = pop();
                        if (num1 == 0) {
                            sb.append("Division by zero!\n");
                            break;
                        }
                        push(num2 / num1);

                    } else {
                        sb.append("Not enough integers in the stack\n");
                    }

                    break;
                case "%":
                    if (first.next != null) {
                        int num1 = pop();
                        int num2 = pop();
                        if (num1 == 0) {
                            sb.append("Division by zero!\n");
                            break;
                        }
                        push(num2 % num1);
                    } else {
                        sb.append("Not enough integers in the stack\n");
                    }
                    break;
                default:
                    try {
                    int data = Integer.parseInt(str);
                    push(data);
                } catch (RuntimeException e) {
                    sb.append("Invalid operator\n");
                }
            }
        }

        return sb.toString();
    }

    // You can add more functions but you can't change the given code.
}
