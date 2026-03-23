#Appending the list elements
l=[]
print("Before Using List:",l)
l.append("BUSHTRA")
l.append("DURGA MADAM")
l.append("GIRISH")
l.append(100)
l.append(0.1)
l.append(2+3)
print("After Using List:",l)
#Combining two lists using extends
l1=["NEELIMA","BUNNY","LOKESH SIR",0.2,199,1+2]
print("Before Using List:",l1)
l.extend(l1)
print("After using List",l)