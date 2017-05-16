var JFrame = Java.type('javax.swing.JFrame');
var tela = new JFrame("Fiu feita com JavaScript")
tela.setSize(300, 300)
tela.locationRelativeTo = null

var FlowLayout = Java.type('java.awt.FlowLayout');
tela.layout = new FlowLayout()

var JButton = Java.type('javax.swing.JButton')
var btt = new JButton("Ola JavaScript")
btt.setBounds(10, 10, 10, 50)
btt.addActionListener(function(e){print("Ola Nashorn!")})

tela.add(btt)
tela.visible = true