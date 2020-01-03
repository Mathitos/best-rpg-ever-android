package dev.mathitos.bestrpgever.history

interface HistoryContract {
    interface View {
    }
    interface Presenter{
        fun bindView(view: View)
        fun onViewCreated()
        fun onDestroy()
    }
    interface Interactor{
        fun bindPresenter(presenter: Presenter)
        fun unbindPresenter()
    }
}