# InterviewTestApp3
This is the starter code for a interview coding test. March 2017.

Prior to starting the test you should be familiar with the following topics.

--- REVIEW LIST (I.E. HINTS) ---
1)	Parcelable
2)	Parcelabler (because implementing Parcelable by hand on more complicated objects is a pain)
3)	FrameLayout
4)	BroadcastReceiver
5)	Intent
6)	IntentFilter
7)	LocalBroadcastManager
8)	WeakReference
9)	Handler
10)	HandlerThread
11)	Fragment
12)	FragmentManager

--- TEST TO DO LIST ---
1) Modify the "content_main.xml" file:
    replace the TextView placeholder with an appropriate container to display fragments
2) Modify GraphData2D:
    make it easy to communicate between threads
3) Modify the code stub (MainAtivity) for pressing the "screen #1" option in the nav drawer:
    display HomeFragment in the container mentioned in step (1).
4) Modify the code stub (MainAtivity) for pressing the "screen #2" option in the nav drawer:
    display GraphFragment in the container mentioned in step (1).
5) Modify the code stub (MainAtivity) for pressing the "start" button:
    start updating the graph data (incrementing phase shift of the sine wave).
6) Modify the code stub (MainAtivity) for pressing the "stop" button:
    stop updating the graph data.
7) Modify the code stub (MainAtivity) for pressing the "reset" button:
    change the phase shift of the sine wave back to 0.
8) Modify the GraphFragment code so that it can be updated with data from an external thread.
9) Modify the GraphFragment (and MainActivity maybe?) so that upon creation of the GraphFragment, the graph displays the current graph data.
10) Modify the GraphHandler to handle communication from the main thread.
    Hint: handle the start, stop, reset, and request data messages
    Hint: handler may need to send messages to itself
11) Modify the GraphHandler to send graph data updates to main thread.
    Hint: may need a modified constructor



