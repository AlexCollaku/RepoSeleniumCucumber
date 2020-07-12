Feature: Print title

  Scenario:
  Given Launch "https://www.naukri.com"
  When Print title of all windows
  Then Close all advertisements windows EXCEPT main window (naukri.com window).