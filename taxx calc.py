while True:
    try:

      income = int(input("Please enter your taxable income: "))
  except ValueError:
      print("Sorry, I didn't understand that please enter taxable income as a number")

      continue
  else:


      break
  if income <= 18200:
      tax = 0

  elif income <= 37000: 
      tax = (income - 18200) * 0.19 

  elif income <= 90000:
      tax = (income-37000) * 0.235 + 3572 

  elif income <= 180000:
      tax = (income - 90000) * 0.37 + 20797 

  else:
      tax = (income - 180000) * 0.45 + 54097

  print("you owe", tax, "dollars in tax!" )
