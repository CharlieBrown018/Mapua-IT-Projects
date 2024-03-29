from tkinter import*
from tkinter import ttk
import tkinter.messagebox
import pymysql
import os
import subprocess

class ConnectorDB:
    
    def __init__(self,root):
        self.root = root
        titlespace = " "
        self.root.title(0 * titlespace + "Xialan Shaomai Products Database GUI")
        self.root.geometry("1400x870+100+0")
        self.root.resizable(width = True, height = True)

        #=================================================Frame Design==========================================================

        MainFrame = Frame(self.root, bd =10, width = 800, height = 500, relief = RIDGE, bg = 'cadet blue')
        MainFrame.pack(expand = TRUE)

        overhead = Frame(MainFrame, bd = 7, width = 800, height = 100, padx = 13, relief = FLAT)
        overhead.grid(row = 0, column = 0)
        
        titlespace = Frame(MainFrame, bd = 5, width = 800, height = 100, padx = 0, bg = 'cadet blue', relief = RIDGE)
        titlespace.grid(row = 1, column = 0)
        
        TopFrame3 = Frame(MainFrame, bd = 2, width = 800, height = 700, padx = 0, bg = 'cadet blue')
        TopFrame3.grid(row = 2, column = 0)

        LeftFrame = Frame(TopFrame3, bd =5, width = 800, height = 100, padx = 0, pady = 20, bg = 'cadet blue')
        LeftFrame.pack(side = LEFT)
        
        LeftFrame1 = Frame(LeftFrame, bd = 5, width = 800, height = 100, padx = 12, pady = 24, relief = RIDGE)
        LeftFrame1.pack(side = TOP)

        RightFrame1 = Frame(TopFrame3, bd = 5, width = 800, height = 100, padx = 0, pady = 14, bg = 'cadet blue')
        RightFrame1.pack(side = RIGHT)
        
        RightFrame1a = Frame(RightFrame1, bd = 5, width = 150, height = 500, padx = 0, pady = 1, bg = 'white', relief = RIDGE)
        RightFrame1a.pack(side = TOP)

        #==========================Variables Declaration=========================================

        Prod_ID = StringVar()
        Prod_Name = StringVar()
        Prod_Price = StringVar()

        #========================Functions Declaration=========================================
        
        def iExit():
            iExit = tkinter.messagebox.askyesno("Xialan Shaomai Products Database GUI", "Confirm if you want to exit")
            if iExit > 0:
                root.destroy()
                return

        def Reset():
            self.entProd_ID.delete(0, END)
            self.entProd_Name.delete(0, END)
            self.entProd_Price.delete(0, END)

        def addData():
            if Prod_ID.get() =="" or Prod_Name.get() =="" or Prod_Price.get() =="":
                tkinter.messagebox.askyesno("Xialan Shaomai Products Database GUI", "Enter Correct Details")
            else:
                sqlCon = pymysql.connect(host = "localhost", user = "root", password = "password", database = "siomai")
                cur = sqlCon.cursor()
                cur.execute("insert into product values(%s,%s,%s)", (

                Prod_ID.get(),
                Prod_Name.get(),
                Prod_Price.get()
                ))
                sqlCon.commit()
                sqlCon.close()
                tkinter.messagebox.showinfo("Xialan Shaomai Products Database GUI", "Record Entered Successfully")

        def DisplayData():
                sqlCon = pymysql.connect(host = "localhost", user = "root", password = "password", database = "siomai")
                cur = sqlCon.cursor()
                cur.execute("select * from product")
                result = cur.fetchall()
                if len(result) != 0:
                    self.product_records.delete(*self.product_records.get_children())
                    for row in result:
                        self.product_records.insert('', END, values = row)
                    sqlCon.commit()
                sqlCon.close()

        def ascData():
            sqlCon = pymysql.connect(host = "localhost", user = "root", password = "password", database = "siomai")
            cur = sqlCon.cursor()
            cur.execute("select * from product order by Prod_ID ASC")
            result = cur.fetchall()
            self.product_records.delete(*self.product_records.get_children())
            for row in result:
                self.product_records.insert('', END, values = row)
            sqlCon.commit()
            sqlCon.close()

        def descData():
            sqlCon = pymysql.connect(host = "localhost", user = "root", password = "password", database = "siomai")
            cur = sqlCon.cursor()
            cur.execute("select * from product order by Prod_ID DESC")
            result = cur.fetchall()
            self.product_records.delete(*self.product_records.get_children())
            for row in result:
                self.product_records.insert('', END, values = row)
            sqlCon.commit()
            sqlCon.close()

        def ProductInfo(ev):
            viewInfo = self.product_records.focus()
            learnerData = self.product_records.item(viewInfo)
            row = learnerData['values']
            Prod_ID.set(row[0]),
            Prod_Name.set(row[1]),
            Prod_Price.set(row[2])

        def Update():
            sqlCon = pymysql.connect(host = "localhost", user = "root", password = "password", database = "siomai")
            cur = sqlCon.cursor()
            cur.execute("update product set Prod_Name = %s, Prod_Price = %s where Prod_ID = %s", (

            Prod_Name.get(),
            Prod_Price.get(),
            Prod_ID.get()
            ))
            sqlCon.commit()
            sqlCon.close()
            tkinter.messagebox.showinfo("Xialan Shaomai Products Database GUI", "Record Updated Successfully")

        def DeleteDB():
            sqlCon = pymysql.connect(host = "localhost", user = "root", password = "password", database = "siomai")
            cur = sqlCon.cursor()
            cur.execute("delete from product where Prod_ID = %s", Prod_ID.get())

            sqlCon.commit()
            sqlCon.close()
            tkinter.messagebox.showinfo("Xialan Shaomai Products Database GUI", "Record Deleted Successfully")
            Reset()

        
        
        def SearchDB():
            try:
                sqlCon = pymysql.connect(localhost = "localhost", user = "root", password = "password", database = "siomai")
                cur = sqlCon.cursor()
                cur.execute("select * from product where Prod_ID = %s"%Prod_ID.get())

                row = cur.fetchone()
                
                Prod_ID.set(row[0]),
                Prod_Name.set(row[1]),
                Prod_Price.set(row[2])
                
                sqlCon.commit()
            except:   
                tkinter.messagebox.showinfo("Xialan Shaomai Products Database GUI", "No Such Record Found")
                Reset()
            sqlCon.close()


        
        def GoToCustomer():
            iExit = tkinter.messagebox.askyesno("Xialan Shaomai Products Database GUI", "Confirm if you want to go to Customers")
            if iExit > 0:
                root.destroy()
            subprocess.Popen([r'Customer.exe'])
            return

        def GoToOrdered():
            iExit = tkinter.messagebox.askyesno("Xialan Shaomai Products Database GUI", "Confirm if you want to go to Orders")
            if iExit > 0:
                root.destroy()
            subprocess.Popen([r'Ordered.exe'])
            return

        def GoToProduct():
            iExit = tkinter.messagebox.askyesno("Xialan Shaomai Products Database GUI", "Confirm if you want to go to Products")
            if iExit > 0:
                root.destroy()
            subprocess.Popen([r'Product.exe'])
            return

        def GoToTransaction():
            iExit = tkinter.messagebox.askyesno("Xialan Shaomai Products Database GUI", "Confirm if you want to go to Transactions")
            if iExit > 0:
                root.destroy()
            subprocess.Popen([r'Transaction.exe'])
            return
            
        #================================================Label Titles and Buttons==========================================================

        self.lbtitle1 = Label(overhead, font = ('arial', 22, 'bold'), text = "Xialan Shaomai Database", bd = 10, pady = 1, padx = 10,
                              width = 70, height = 2).grid(row = 0, column = 0, padx = 0)

        self.btnCustomer = Button(titlespace, font = ('arial', 20, 'bold'), text = "Customers", bd = 4, pady = 1, padx = 10,
                                width = 15, height = 2, command = GoToCustomer).grid(row = 1, column = 0, padx = 20)

        self.btnOrdered = Button(titlespace, font = ('arial', 20, 'bold'), text = "Orders", bd = 4, pady = 1, padx = 10,
                                width = 15, height = 2, command = GoToOrdered).grid(row = 1, column = 1, padx = 20)

        self.btnProduct = Button(titlespace, font = ('arial', 20, 'bold'), text = "Products", bd = 4, pady = 1, padx = 10,
                                width = 15, height = 2).grid(row = 1, column = 2, padx = 20)

        self.btnTransaction = Button(titlespace, font = ('arial', 20, 'bold'), text = "Transactions", bd = 4, pady = 1, padx = 10,
                                width = 15, height = 2, command = GoToTransaction).grid(row = 1, column = 3, padx = 20)
        
        #================================================Label and Entry Widget==========================================================
        
        self.lblProd_ID = Label(LeftFrame1, font = ('arial', 12, 'bold'), text = "Product ID", bd = 7)
        self.lblProd_ID.grid(row = 0, column = 0, sticky = W, padx = 100)
        self.entProd_ID = Entry(LeftFrame1, font = ('arial', 12, 'bold'), bd = 5, width = 44, justify = 'left', textvariable = Prod_ID)
        self.entProd_ID.grid(row = 0, column = 1, sticky = W, padx = 100)
        
        self.lblProd_Name = Label(LeftFrame1, font = ('arial', 12, 'bold'), text = "Product Name", bd = 7)
        self.lblProd_Name.grid(row = 1, column = 0, sticky = W, padx = 100)
        self.entProd_Name = Entry(LeftFrame1, font = ('arial', 12, 'bold'), bd = 5, width = 44, justify = 'left', textvariable = Prod_Name)
        self.entProd_Name.grid(row = 1, column = 1, sticky = W, padx = 100)        

        self.lblProd_Price = Label(LeftFrame1, font = ('arial', 12, 'bold'), text = "Product Price", bd = 7)
        self.lblProd_Price.grid(row = 2, column = 0, sticky = W, padx = 100)
        self.entProd_Price = Entry(LeftFrame1, font = ('arial', 12, 'bold'), bd = 5, width = 44, justify = 'left', textvariable = Prod_Price)
        self.entProd_Price.grid(row = 2, column = 1, sticky = W, padx = 100)

        #=======================================================Table Treeview Widget=============================================================

        scroll_y = Scrollbar(LeftFrame, orient = VERTICAL)
        
        self.product_records = ttk.Treeview(LeftFrame, height = 14, columns = ("Prod_ID", "Prod_Name", "Prod_Price"), yscrollcommand = scroll_y.set)
        scroll_y.pack(side = RIGHT, fill = Y)
        
        self.product_records.heading("Prod_ID", text="Product ID")
        self.product_records.heading("Prod_Name", text="Product Name")
        self.product_records.heading("Prod_Price", text="Product Price")

        self.product_records['show'] = 'headings'

        self.product_records.column("Prod_ID", width = 100)
        self.product_records.column("Prod_Name", width = 100)
        self.product_records.column("Prod_Price", width = 100)

        self.product_records.pack(fill = BOTH, expand = 1)
        self.product_records.bind("<ButtonRelease-1>", ProductInfo)
        #DisplayData()
        
        
        #=======================================================Buttons Widget===================================================================

        self.btnAddNew = Button(RightFrame1a, font = ('arial', 16, 'bold'), text = "Add new", bd = 1, pady = 1, padx = 10,
                                width = 8, height = 2, command = addData).grid(row = 0, column = 0, padx = 1)

        self.btnDisplayData = Button(RightFrame1a, font = ('arial', 16, 'bold'), text = "Display", bd = 1, pady = 1, padx = 10,
                                width = 8, height = 2, command = DisplayData).grid(row = 1, column = 0, padx = 1,)

        self.btnUpdate = Button(RightFrame1a, font = ('arial', 16, 'bold'), text = "Update", bd = 1, pady = 1, padx = 10,
                                width = 8, height = 2, command = Update).grid(row = 2, column = 0, padx = 1)

        self.btnDeleteDB = Button(RightFrame1a, font = ('arial', 16, 'bold'), text = "Delete", bd = 1, pady = 1, padx = 10,
                                width = 8, height = 2, command = DeleteDB).grid(row = 3, column = 0, padx = 1)

        self.btnSearchDB = Button(RightFrame1a, font = ('arial', 16, 'bold'), text = "Search", bd = 1, pady = 1, padx = 10,
                                width = 8, height = 2, command = SearchDB).grid(row = 4, column = 0, padx = 1)
                                                                                
        self.btnascData = Button(RightFrame1a, font = ('arial', 16, 'bold'), text = "Ascending", bd = 1, pady = 1, padx = 10,
                                width = 8, height = 2, command = ascData).grid(row = 5, column = 0, padx = 1)

        self.btndescData = Button(RightFrame1a, font = ('arial', 16, 'bold'), text = "Descending", bd = 1, pady = 1, padx = 10,
                                width = 8, height = 2, command = descData).grid(row = 6, column = 0, padx = 1) 

        self.btnReset = Button(RightFrame1a, font = ('arial', 16, 'bold'), text = "Reset", bd = 1, pady = 1, padx = 10,
                                width = 8, height = 2, command = Reset).grid(row = 7, column = 0, padx = 1)

        self.btniExit = Button(RightFrame1a, font = ('arial', 16, 'bold'), text = "Exit", bd = 1, pady = 1, padx = 10,
                                width = 8, height = 2, command = iExit).grid(row = 8, column = 0, padx = 1)      

        
if __name__=='__main__':
    root = Tk()
    application = ConnectorDB(root)
    root.mainloop()
