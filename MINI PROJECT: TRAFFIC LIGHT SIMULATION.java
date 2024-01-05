import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
class A extends JFrame implements ItemListener {
public JLabel l1, l2;
public JRadioButton r1, r2, r3;
public ButtonGroup bg;
public JPanel p, p1;
public A() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new GridLayout(2, 1));
setSize(800, 400);
p = new JPanel(new FlowLayout());
p1 = new JPanel(new FlowLayout());
l1 = new JLabel();

Font f = new Font(&quot;Verdana&quot;, Font.BOLD, 60);
l1.setFont(f);
add(l1);
p.add(l1);
add(p);
l2 = new JLabel(&quot;Select Lights&quot;);
p1.add(l2);
JRadioButton r1 = new JRadioButton(&quot;Red Light&quot;);
r1.setBackground(Color.red);
p1.add(r1);
r1.addItemListener(this);
JRadioButton r2 = new JRadioButton(&quot;Yellow Light&quot;);
r2.setBackground(Color.YELLOW);
p1.add(r2);
r2.addItemListener(this);
JRadioButton r3 = new JRadioButton(&quot;Green Light&quot;);
r3.setBackground(Color.GREEN);
p1.add(r3);
r3.addItemListener(this);
add(p1);
bg = new ButtonGroup();
bg.add(r1);
bg.add(r2);
bg.add(r3);
setVisible(true);
}
public void itemStateChanged(ItemEvent i) {
JRadioButton jb = (JRadioButton) i.getSource();
switch (jb.getText()) {
case &quot;Red Light&quot;: {
l1.setText(&quot;STOP&quot;);

l1.setForeground(Color.red);
}
break;
case &quot;Yellow Light&quot;: {
l1.setText(&quot;Ready&quot;);
l1.setForeground(Color.YELLOW);
}
break;
case &quot;Green Light&quot;: {
l1.setText(&quot;GO&quot;);
l1.setForeground(Color.GREEN);
}
break;
}
}
}
public class TLights {
public static void main(String[] args) {
A a = new A();
}
}
