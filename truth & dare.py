def main():
  print_logo()
  # Request truth_dare json data
  truth_dare_list = requestJson(truth_dare_url)
  
  # Parse and create list of truth and dare
  truth_list = [
      item
      for item in truth_dare_list
      if item["type"] == "Truth"
  ]
  dare_list = [
      item
      for item in truth_dare_list
      if item["type"] == "Dare"
  ]
  print(dare_list[0])
  print(truth_list[0])
if __name__ == "__main__":
    main()
