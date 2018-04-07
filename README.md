
## Android JobScheduler Sample using Kotlin

To understand how this sample works, try these different scenarios:

- Unplug device, schedule a task that requires the device to be plugged in. Job will start when the
device is plugged in.
- Set a delay of 10 seconds and press back. The activity and service are finished but the service is
launched again in 10 seconds (logcat will show debug messages).
- Set a delay of 5 seconds and a work duration of 10 seconds. Schedule job and press the
back button. Open the activity again after 6 seconds. The activity will show the onStopTask even
though both activity and service were shut down.
